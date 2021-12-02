package subProj_1184

import subProj_1184.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1184")
    name = "subProj 1184"

    buildType(subProj_bt_1184_2)
    buildType(subProj_bt_1184_3)
    buildType(subProj_bt_1184_4)
    buildType(subProj_bt_1184_5)
    buildType(subProj_bt_1184_0)
    buildType(subProj_bt_1184_1)
})
