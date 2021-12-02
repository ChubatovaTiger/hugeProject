package subProj_424

import subProj_424.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_424")
    name = "subProj 424"

    buildType(subProj_bt_424_1)
    buildType(subProj_bt_424_0)
    buildType(subProj_bt_424_3)
    buildType(subProj_bt_424_2)
    buildType(subProj_bt_424_5)
    buildType(subProj_bt_424_4)
})
