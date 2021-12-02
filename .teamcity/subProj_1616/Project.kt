package subProj_1616

import subProj_1616.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1616")
    name = "subProj 1616"

    buildType(subProj_bt_1616_5)
    buildType(subProj_bt_1616_4)
    buildType(subProj_bt_1616_3)
    buildType(subProj_bt_1616_2)
    buildType(subProj_bt_1616_1)
    buildType(subProj_bt_1616_0)
})
