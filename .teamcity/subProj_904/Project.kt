package subProj_904

import subProj_904.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_904")
    name = "subProj 904"

    buildType(subProj_bt_904_5)
    buildType(subProj_bt_904_3)
    buildType(subProj_bt_904_4)
    buildType(subProj_bt_904_1)
    buildType(subProj_bt_904_2)
    buildType(subProj_bt_904_0)
})
