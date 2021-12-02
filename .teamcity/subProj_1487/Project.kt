package subProj_1487

import subProj_1487.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1487")
    name = "subProj 1487"

    buildType(subProj_bt_1487_4)
    buildType(subProj_bt_1487_5)
    buildType(subProj_bt_1487_2)
    buildType(subProj_bt_1487_3)
    buildType(subProj_bt_1487_0)
    buildType(subProj_bt_1487_1)
})
