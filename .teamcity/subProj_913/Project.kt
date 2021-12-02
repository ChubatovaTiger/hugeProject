package subProj_913

import subProj_913.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_913")
    name = "subProj 913"

    buildType(subProj_bt_913_0)
    buildType(subProj_bt_913_5)
    buildType(subProj_bt_913_4)
    buildType(subProj_bt_913_3)
    buildType(subProj_bt_913_2)
    buildType(subProj_bt_913_1)
})
