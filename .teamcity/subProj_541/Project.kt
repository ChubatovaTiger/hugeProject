package subProj_541

import subProj_541.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_541")
    name = "subProj 541"

    buildType(subProj_bt_541_2)
    buildType(subProj_bt_541_3)
    buildType(subProj_bt_541_4)
    buildType(subProj_bt_541_5)
    buildType(subProj_bt_541_0)
    buildType(subProj_bt_541_1)
})
