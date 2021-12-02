package subProj_146

import subProj_146.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_146")
    name = "subProj 146"

    buildType(subProj_bt_146_5)
    buildType(subProj_bt_146_4)
    buildType(subProj_bt_146_3)
    buildType(subProj_bt_146_2)
    buildType(subProj_bt_146_1)
    buildType(subProj_bt_146_0)
})
