package subProj_1279

import subProj_1279.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1279")
    name = "subProj 1279"

    buildType(subProj_bt_1279_1)
    buildType(subProj_bt_1279_2)
    buildType(subProj_bt_1279_0)
    buildType(subProj_bt_1279_5)
    buildType(subProj_bt_1279_3)
    buildType(subProj_bt_1279_4)
})
