package subProj_796

import subProj_796.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_796")
    name = "subProj 796"

    buildType(subProj_bt_796_4)
    buildType(subProj_bt_796_5)
    buildType(subProj_bt_796_2)
    buildType(subProj_bt_796_3)
    buildType(subProj_bt_796_0)
    buildType(subProj_bt_796_1)
})
