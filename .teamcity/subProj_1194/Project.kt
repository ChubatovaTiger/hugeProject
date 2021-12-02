package subProj_1194

import subProj_1194.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1194")
    name = "subProj 1194"

    buildType(subProj_bt_1194_4)
    buildType(subProj_bt_1194_3)
    buildType(subProj_bt_1194_5)
    buildType(subProj_bt_1194_0)
    buildType(subProj_bt_1194_2)
    buildType(subProj_bt_1194_1)
})
