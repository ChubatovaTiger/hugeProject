package subProj_511

import subProj_511.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_511")
    name = "subProj 511"

    buildType(subProj_bt_511_5)
    buildType(subProj_bt_511_3)
    buildType(subProj_bt_511_4)
    buildType(subProj_bt_511_1)
    buildType(subProj_bt_511_2)
    buildType(subProj_bt_511_0)
})
