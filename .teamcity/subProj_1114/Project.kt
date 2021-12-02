package subProj_1114

import subProj_1114.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1114")
    name = "subProj 1114"

    buildType(subProj_bt_1114_0)
    buildType(subProj_bt_1114_2)
    buildType(subProj_bt_1114_1)
    buildType(subProj_bt_1114_4)
    buildType(subProj_bt_1114_3)
    buildType(subProj_bt_1114_5)
})
