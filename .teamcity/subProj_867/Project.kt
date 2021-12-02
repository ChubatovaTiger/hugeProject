package subProj_867

import subProj_867.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_867")
    name = "subProj 867"

    buildType(subProj_bt_867_5)
    buildType(subProj_bt_867_4)
    buildType(subProj_bt_867_3)
    buildType(subProj_bt_867_2)
    buildType(subProj_bt_867_1)
    buildType(subProj_bt_867_0)
})
