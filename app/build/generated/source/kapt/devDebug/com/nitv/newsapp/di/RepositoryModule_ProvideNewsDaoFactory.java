// Generated by Dagger (https://dagger.dev).
package com.nitv.newsapp.di;

import com.nitv.newsapp.data.local.NewsDao;
import com.nitv.newsapp.data.local.NewsDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<NewsDatabase> dbProvider;

  public RepositoryModule_ProvideNewsDaoFactory(Provider<NewsDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(dbProvider.get());
  }

  public static RepositoryModule_ProvideNewsDaoFactory create(Provider<NewsDatabase> dbProvider) {
    return new RepositoryModule_ProvideNewsDaoFactory(dbProvider);
  }

  public static NewsDao provideNewsDao(NewsDatabase db) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideNewsDao(db));
  }
}
