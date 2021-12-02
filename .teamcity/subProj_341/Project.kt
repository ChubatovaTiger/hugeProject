package subProj_341

import subProj_341.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_341")
    name = "subProj 341"

    buildType(subProj_bt_341_4)
    buildType(subProj_bt_341_5)
    buildType(subProj_bt_341_0)
    buildType(subProj_bt_341_1)
    buildType(subProj_bt_341_2)
    buildType(subProj_bt_341_3)
})
