package subProj_93

import subProj_93.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_93")
    name = "subProj 93"

    buildType(subProj_bt_93_3)
    buildType(subProj_bt_93_2)
    buildType(subProj_bt_93_1)
    buildType(subProj_bt_93_0)
    buildType(subProj_bt_93_5)
    buildType(subProj_bt_93_4)
})
