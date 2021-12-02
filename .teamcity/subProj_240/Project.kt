package subProj_240

import subProj_240.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_240")
    name = "subProj 240"

    buildType(subProj_bt_240_3)
    buildType(subProj_bt_240_2)
    buildType(subProj_bt_240_5)
    buildType(subProj_bt_240_4)
    buildType(subProj_bt_240_1)
    buildType(subProj_bt_240_0)
})
