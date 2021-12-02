package subProj_1095

import subProj_1095.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1095")
    name = "subProj 1095"

    buildType(subProj_bt_1095_5)
    buildType(subProj_bt_1095_4)
    buildType(subProj_bt_1095_3)
    buildType(subProj_bt_1095_2)
    buildType(subProj_bt_1095_1)
    buildType(subProj_bt_1095_0)
})
