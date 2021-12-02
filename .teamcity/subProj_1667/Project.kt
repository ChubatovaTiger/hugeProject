package subProj_1667

import subProj_1667.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1667")
    name = "subProj 1667"

    buildType(subProj_bt_1667_4)
    buildType(subProj_bt_1667_5)
    buildType(subProj_bt_1667_2)
    buildType(subProj_bt_1667_3)
    buildType(subProj_bt_1667_0)
    buildType(subProj_bt_1667_1)
})
