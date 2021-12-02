package subProj_172

import subProj_172.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_172")
    name = "subProj 172"

    buildType(subProj_bt_172_1)
    buildType(subProj_bt_172_0)
    buildType(subProj_bt_172_3)
    buildType(subProj_bt_172_2)
    buildType(subProj_bt_172_5)
    buildType(subProj_bt_172_4)
})
