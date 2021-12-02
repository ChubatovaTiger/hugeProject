package subProj_122

import subProj_122.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_122")
    name = "subProj 122"

    buildType(subProj_bt_122_5)
    buildType(subProj_bt_122_3)
    buildType(subProj_bt_122_4)
    buildType(subProj_bt_122_1)
    buildType(subProj_bt_122_2)
    buildType(subProj_bt_122_0)
})
