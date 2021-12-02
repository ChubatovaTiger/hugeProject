package subProj_790

import subProj_790.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_790")
    name = "subProj 790"

    buildType(subProj_bt_790_4)
    buildType(subProj_bt_790_5)
    buildType(subProj_bt_790_2)
    buildType(subProj_bt_790_3)
    buildType(subProj_bt_790_0)
    buildType(subProj_bt_790_1)
})
