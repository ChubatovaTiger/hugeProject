package subProj_1354

import subProj_1354.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1354")
    name = "subProj 1354"

    buildType(subProj_bt_1354_0)
    buildType(subProj_bt_1354_5)
    buildType(subProj_bt_1354_4)
    buildType(subProj_bt_1354_3)
    buildType(subProj_bt_1354_2)
    buildType(subProj_bt_1354_1)
})
