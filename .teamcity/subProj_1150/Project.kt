package subProj_1150

import subProj_1150.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1150")
    name = "subProj 1150"

    buildType(subProj_bt_1150_2)
    buildType(subProj_bt_1150_1)
    buildType(subProj_bt_1150_0)
    buildType(subProj_bt_1150_5)
    buildType(subProj_bt_1150_4)
    buildType(subProj_bt_1150_3)
})
