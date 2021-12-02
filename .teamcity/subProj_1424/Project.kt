package subProj_1424

import subProj_1424.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1424")
    name = "subProj 1424"

    buildType(subProj_bt_1424_5)
    buildType(subProj_bt_1424_1)
    buildType(subProj_bt_1424_2)
    buildType(subProj_bt_1424_3)
    buildType(subProj_bt_1424_4)
    buildType(subProj_bt_1424_0)
})
