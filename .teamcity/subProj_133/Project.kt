package subProj_133

import subProj_133.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_133")
    name = "subProj 133"

    buildType(subProj_bt_133_5)
    buildType(subProj_bt_133_4)
    buildType(subProj_bt_133_3)
    buildType(subProj_bt_133_2)
    buildType(subProj_bt_133_1)
    buildType(subProj_bt_133_0)
})
