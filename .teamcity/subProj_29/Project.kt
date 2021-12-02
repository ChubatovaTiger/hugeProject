package subProj_29

import subProj_29.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_29")
    name = "subProj 29"

    buildType(subProj_bt_29_3)
    buildType(subProj_bt_29_4)
    buildType(subProj_bt_29_5)
    buildType(subProj_bt_29_0)
    buildType(subProj_bt_29_1)
    buildType(subProj_bt_29_2)
})
