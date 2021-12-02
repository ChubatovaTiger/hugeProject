package subProj_111

import subProj_111.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_111")
    name = "subProj 111"

    buildType(subProj_bt_111_5)
    buildType(subProj_bt_111_3)
    buildType(subProj_bt_111_4)
    buildType(subProj_bt_111_1)
    buildType(subProj_bt_111_2)
    buildType(subProj_bt_111_0)
})
