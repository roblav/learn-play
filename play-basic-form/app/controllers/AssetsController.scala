package controllers

import com.google.inject.Inject
import play.api.http.HttpErrorHandler

/**
  * Created by rob on 24/05/17.
  */
class AssetsController @Inject() (errorHandler: HttpErrorHandler) extends AssetsBuilder(errorHandler)
