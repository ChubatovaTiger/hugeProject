package subProj_408

import subProj_408.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_408")
    name = "subProj 408"

    buildType(subProj_bt_408_0)
    buildType(subProj_bt_408_1)
    buildType(subProj_bt_408_2)
    buildType(subProj_bt_408_3)
    buildType(subProj_bt_408_4)
    buildType(subProj_bt_408_5)
})
