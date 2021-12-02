package subProj_782

import subProj_782.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_782")
    name = "subProj 782"

    buildType(subProj_bt_782_1)
    buildType(subProj_bt_782_2)
    buildType(subProj_bt_782_0)
    buildType(subProj_bt_782_5)
    buildType(subProj_bt_782_3)
    buildType(subProj_bt_782_4)
})
