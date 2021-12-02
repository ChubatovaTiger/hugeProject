package subProj_667

import subProj_667.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_667")
    name = "subProj 667"

    buildType(subProj_bt_667_5)
    buildType(subProj_bt_667_4)
    buildType(subProj_bt_667_3)
    buildType(subProj_bt_667_2)
    buildType(subProj_bt_667_1)
    buildType(subProj_bt_667_0)
})
