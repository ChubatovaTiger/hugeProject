package subProj_354

import subProj_354.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_354")
    name = "subProj 354"

    buildType(subProj_bt_354_2)
    buildType(subProj_bt_354_3)
    buildType(subProj_bt_354_4)
    buildType(subProj_bt_354_5)
    buildType(subProj_bt_354_0)
    buildType(subProj_bt_354_1)
})
