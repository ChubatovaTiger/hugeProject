package subProj_9

import subProj_9.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_9")
    name = "subProj 9"

    buildType(subProj_bt_9_5)
    buildType(subProj_bt_9_3)
    buildType(subProj_bt_9_4)
    buildType(subProj_bt_9_1)
    buildType(subProj_bt_9_2)
    buildType(subProj_bt_9_0)
})
