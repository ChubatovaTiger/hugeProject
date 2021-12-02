package subProj_1290

import subProj_1290.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1290")
    name = "subProj 1290"

    buildType(subProj_bt_1290_1)
    buildType(subProj_bt_1290_0)
    buildType(subProj_bt_1290_5)
    buildType(subProj_bt_1290_4)
    buildType(subProj_bt_1290_3)
    buildType(subProj_bt_1290_2)
})
