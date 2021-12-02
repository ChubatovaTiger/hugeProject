package subProj_1731

import subProj_1731.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1731")
    name = "subProj 1731"

    buildType(subProj_bt_1731_4)
    buildType(subProj_bt_1731_5)
    buildType(subProj_bt_1731_2)
    buildType(subProj_bt_1731_3)
    buildType(subProj_bt_1731_0)
    buildType(subProj_bt_1731_1)
})
