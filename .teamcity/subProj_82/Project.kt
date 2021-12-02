package subProj_82

import subProj_82.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_82")
    name = "subProj 82"

    buildType(subProj_bt_82_2)
    buildType(subProj_bt_82_3)
    buildType(subProj_bt_82_0)
    buildType(subProj_bt_82_1)
    buildType(subProj_bt_82_4)
    buildType(subProj_bt_82_5)
})
