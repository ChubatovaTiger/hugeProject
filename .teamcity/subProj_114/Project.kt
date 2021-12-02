package subProj_114

import subProj_114.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_114")
    name = "subProj 114"

    buildType(subProj_bt_114_4)
    buildType(subProj_bt_114_5)
    buildType(subProj_bt_114_2)
    buildType(subProj_bt_114_3)
    buildType(subProj_bt_114_0)
    buildType(subProj_bt_114_1)
})
