package subProj_112

import subProj_112.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_112")
    name = "subProj 112"

    buildType(subProj_bt_112_4)
    buildType(subProj_bt_112_5)
    buildType(subProj_bt_112_2)
    buildType(subProj_bt_112_3)
    buildType(subProj_bt_112_0)
    buildType(subProj_bt_112_1)
})
