package subProj_1904

import subProj_1904.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1904")
    name = "subProj 1904"

    buildType(subProj_bt_1904_1)
    buildType(subProj_bt_1904_0)
    buildType(subProj_bt_1904_3)
    buildType(subProj_bt_1904_2)
    buildType(subProj_bt_1904_5)
    buildType(subProj_bt_1904_4)
})
