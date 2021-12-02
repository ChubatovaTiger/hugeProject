package subProj_46

import subProj_46.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_46")
    name = "subProj 46"

    buildType(subProj_bt_46_1)
    buildType(subProj_bt_46_0)
    buildType(subProj_bt_46_3)
    buildType(subProj_bt_46_2)
    buildType(subProj_bt_46_5)
    buildType(subProj_bt_46_4)
})
