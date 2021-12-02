package subProj_1222

import subProj_1222.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1222")
    name = "subProj 1222"

    buildType(subProj_bt_1222_0)
    buildType(subProj_bt_1222_5)
    buildType(subProj_bt_1222_4)
    buildType(subProj_bt_1222_3)
    buildType(subProj_bt_1222_2)
    buildType(subProj_bt_1222_1)
})
