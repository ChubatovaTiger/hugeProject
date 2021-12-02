package subProj_1307

import subProj_1307.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1307")
    name = "subProj 1307"

    buildType(subProj_bt_1307_5)
    buildType(subProj_bt_1307_2)
    buildType(subProj_bt_1307_1)
    buildType(subProj_bt_1307_4)
    buildType(subProj_bt_1307_3)
    buildType(subProj_bt_1307_0)
})
