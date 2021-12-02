package subProj_1651

import subProj_1651.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1651")
    name = "subProj 1651"

    buildType(subProj_bt_1651_0)
    buildType(subProj_bt_1651_2)
    buildType(subProj_bt_1651_1)
    buildType(subProj_bt_1651_4)
    buildType(subProj_bt_1651_3)
    buildType(subProj_bt_1651_5)
})
