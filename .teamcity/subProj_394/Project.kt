package subProj_394

import subProj_394.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_394")
    name = "subProj 394"

    buildType(subProj_bt_394_4)
    buildType(subProj_bt_394_5)
    buildType(subProj_bt_394_2)
    buildType(subProj_bt_394_3)
    buildType(subProj_bt_394_0)
    buildType(subProj_bt_394_1)
})
