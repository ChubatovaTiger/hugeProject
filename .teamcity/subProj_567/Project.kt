package subProj_567

import subProj_567.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_567")
    name = "subProj 567"

    buildType(subProj_bt_567_1)
    buildType(subProj_bt_567_0)
    buildType(subProj_bt_567_3)
    buildType(subProj_bt_567_2)
    buildType(subProj_bt_567_5)
    buildType(subProj_bt_567_4)
})
