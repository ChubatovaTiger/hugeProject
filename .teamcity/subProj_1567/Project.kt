package subProj_1567

import subProj_1567.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1567")
    name = "subProj 1567"

    buildType(subProj_bt_1567_5)
    buildType(subProj_bt_1567_1)
    buildType(subProj_bt_1567_2)
    buildType(subProj_bt_1567_3)
    buildType(subProj_bt_1567_4)
    buildType(subProj_bt_1567_0)
})
