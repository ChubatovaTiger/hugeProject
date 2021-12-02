package subProj_158

import subProj_158.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_158")
    name = "subProj 158"

    buildType(subProj_bt_158_0)
    buildType(subProj_bt_158_1)
    buildType(subProj_bt_158_2)
    buildType(subProj_bt_158_3)
    buildType(subProj_bt_158_4)
    buildType(subProj_bt_158_5)
})
