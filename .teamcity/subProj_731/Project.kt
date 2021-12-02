package subProj_731

import subProj_731.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_731")
    name = "subProj 731"

    buildType(subProj_bt_731_2)
    buildType(subProj_bt_731_1)
    buildType(subProj_bt_731_0)
    buildType(subProj_bt_731_5)
    buildType(subProj_bt_731_4)
    buildType(subProj_bt_731_3)
})
