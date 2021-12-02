package subProj_98

import subProj_98.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_98")
    name = "subProj 98"

    buildType(subProj_bt_98_2)
    buildType(subProj_bt_98_1)
    buildType(subProj_bt_98_0)
    buildType(subProj_bt_98_5)
    buildType(subProj_bt_98_4)
    buildType(subProj_bt_98_3)
})
