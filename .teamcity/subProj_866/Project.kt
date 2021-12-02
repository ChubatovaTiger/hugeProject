package subProj_866

import subProj_866.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_866")
    name = "subProj 866"

    buildType(subProj_bt_866_5)
    buildType(subProj_bt_866_4)
    buildType(subProj_bt_866_3)
    buildType(subProj_bt_866_2)
    buildType(subProj_bt_866_1)
    buildType(subProj_bt_866_0)
})
