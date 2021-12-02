package subProj_857

import subProj_857.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_857")
    name = "subProj 857"

    buildType(subProj_bt_857_5)
    buildType(subProj_bt_857_4)
    buildType(subProj_bt_857_3)
    buildType(subProj_bt_857_2)
    buildType(subProj_bt_857_1)
    buildType(subProj_bt_857_0)
})
