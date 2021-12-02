package subProj_1867

import subProj_1867.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1867")
    name = "subProj 1867"

    buildType(subProj_bt_1867_0)
    buildType(subProj_bt_1867_1)
    buildType(subProj_bt_1867_4)
    buildType(subProj_bt_1867_5)
    buildType(subProj_bt_1867_2)
    buildType(subProj_bt_1867_3)
})
