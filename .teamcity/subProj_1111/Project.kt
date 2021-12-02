package subProj_1111

import subProj_1111.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1111")
    name = "subProj 1111"

    buildType(subProj_bt_1111_3)
    buildType(subProj_bt_1111_2)
    buildType(subProj_bt_1111_5)
    buildType(subProj_bt_1111_4)
    buildType(subProj_bt_1111_1)
    buildType(subProj_bt_1111_0)
})
